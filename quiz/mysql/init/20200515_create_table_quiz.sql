CREATE TABLE quiz (
    id INT(11) AUTO_INCREMENT NOT NULL COMMENT 'ユニークキー',
    quiz_sentence VARCHAR(255) COMMENT '問題文',
    phonetic VARCHAR(255) COMMENT '問題文の読み',
    quiz_answer VARCHAR(255) COMMENT '問題文の答え',
    genre VARCHAR(30) COMMENT 'ジャンル',
    level CHAR(1) COMMENT '難易度',
    right_answer_number INT(11) NOT NULL DEFAULT 0 COMMENT '正解数',
    wrong_answer_number INT(11) NOT NULL DEFAULT 0 COMMENT '誤答数',
    source VARCHAR(100) COMMENT '出典元',
    PRIMARY KEY (id)
) COMMENT = 'クイズ問題集' ENGINE=InnoDB CHARSET=utf8;