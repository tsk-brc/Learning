<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>早押しトレーニング</title>
</head>
<body onLoad="disp()">

<?php

$dsn = 'mysql:host=mysql; dbname=quiz';
$user = 'root';
$password = 'root-pass';
        
try{
    $dbh = new PDO($dsn, $user, $password);

    $sql = 'SELECT * FROM quiz WHERE status != 0 ORDER BY RAND() LIMIT 1;';
    foreach ($dbh->query($sql) as $row) {
        echo <<<EOM
          <form action="#" name="form2">
            <textarea name="title" cols="15" rows="2" style="border:none; font-size:1.3em; resize:none;"></textarea>
          </form>
          <br>
          <form action="#" name="form1">
            <textarea name="field1" cols="100" rows="5" style="border:none; font-size:1.5em; resize:none;" wrap="soft"></textarea>
          </form>
          <div id="sentense" hidden="hidden">$row[1]</div>
          <div id="value1" hidden="hidden">$row[1]</div>
          <div id="value2" hidden="hidden">$row[2]</div>
          <div id="lavel"></div>
          <div id="answer"></div>
          <script>
             // 設定（メッセージの内容と表示スピードを設定）
             sentense = document.getElementById("sentense");
             var msg = sentense.innerHTML;
             // 表示スピード（1に近いほど速い）
             var speed = 120;
             // 表示スピード（1に近いほど速い）
             var titlespeed = 180;
             // 繰り返し(0 = 繰り返す｜1 = 1回だけ)
             var flag = 1;
             // 終了フラグ(0:未終了｜1:問題が読み終わった｜2:ボタンが押された)
             var finFlag = 0; 
             // 設定終了
             var count = 0;
             var titlecount = 0;

             var disp = function(){
               if(titlecount < 5){
                 var title = "問題";
                 var type = title.substring(0, titlecount);
                 document.form2.title.value = type;
                 titlecount++;
                 var rep = setTimeout("disp()", titlespeed);
               } else {
                 //表示する文字列を取得
                 var type = msg.substring(0, count);
                 // テキストフィールドにデータを渡す処理
                 document.form1.field1.value = type;
                 //表示文字列カウンタを1追加
                 count ++;

                 var rep = setTimeout("disp()", speed);

                 if(count > msg.length + 1){
                   if(flag == 1){
                     clearTimeout(rep);
                     if(finFlag == 0){
                       finFlag = 1;
                     }
                     if(finFlag == 1){
                       //3秒スリープ後、問題文と答えを表示
                       adjustment(3000);
                       document.form2.title.value = "問題";
                       document.form1.field1.style.color = "black";
                       document.form1.field1.value = value1.innerHTML;
                       lavel = document.getElementById("lavel");
                       lavel.innerHTML = "答え";
                       answer = document.getElementById("answer");
                       value2 = document.getElementById("value2");
                       answer.innerHTML = value2.innerHTML;
                     } else {
                       //ボタンが押された場合にはすぐに問題文と答えを表示する
                       document.form2.title.value = "問題";
                       document.form1.field1.style.color = "black";
                       document.form1.field1.value = value1.innerHTML;
                       lavel = document.getElementById("lavel");
                       lavel.innerHTML = "答え";
                       answer = document.getElementById("answer");
                       value2 = document.getElementById("value2");
                       answer.innerHTML = value2.innerHTML;
                     }
                   } else { 
                     count = 0;
                   }
                 }
               }
            }

            var answer = function(){
              finFlag = 2;
              //0.3秒遅延してから文字を白色にする
              setTimeout('sleep();', 300);
              //0.310秒遅延してから5秒間停止する
              setTimeout('adjustment(5000);', 310);
            }

            var sleep = function(){
              count = msg.length + 1;
              document.form1.field1.style.color = "white";
            }

            var adjustment = function(msec){
              var startMsec = new Date();
              // 指定ミリ秒間だけループさせる（CPUは常にビジー状態）
              while (new Date() - startMsec < msec);
            }
          </script>
        EOM;
    }
}catch (PDOException $e){
    print('Error:'.$e->getMessage());
    die();
}

$dbh = null;

?>
<br>
<br>
<button type="button" name="answer" onclick="answer()"><font size="30">回答</font></button>
<br>    
<br>
<input type="button" value="他の問題を選ぶ" style="width:120px; height:30px" onclick="location.href='buzzering-quiz.php'" />
<input type="button" value="トップに戻る" style="width:100px; height:30px" onclick="location.href='index.html'" />
</body>
</html>