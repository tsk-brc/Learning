//
//  ViewController.swift
//  studyByProgate
//
//  Created by T_o_s_s_h_y on 2019/06/20.
//  Copyright © 2019 T_o_s_s_h_y. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var textField: UITextField!
    @IBOutlet weak var label: UILabel!
    @IBOutlet weak var question: UILabel!
    @IBOutlet weak var selected1: UILabel!
    @IBOutlet weak var selected2: UILabel!
    @IBOutlet weak var selected3: UILabel!
    @IBOutlet weak var result: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = "Quiz"
        question.text = "Q. Swiftのロゴはな〜んだ？"
        selected1.text = "a.ペンギン"
        selected2.text = "b.ツバメ"
        selected3.text = "c.カラス"
        result.text = nil
    }
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }

    @IBAction func ButtonTupped(_ sender: Any) {
        let answer = "b"
        let inputText:String = textField.text!
        if inputText == answer{
            result.text = "正解です"
        } else {
            result.text = "不正解です"
        }
    }
}


