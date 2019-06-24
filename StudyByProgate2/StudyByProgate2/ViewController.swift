//
//  ViewController.swift
//  StudyByProgate2
//
//  Created by T_o_s_s_h_y on 2019/06/24.
//  Copyright © 2019 T_o_s_s_h_y. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    
    @IBOutlet weak var label: UILabel!
    @IBOutlet weak var textField: UITextField!
    @IBOutlet weak var answer: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = "英単語を入力してください"
        answer.text = nil
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    @IBAction func buttonTupped(_ sender: Any) {
        let dictionary: [String: String] = [
            "apple": "りんご",
            "banana": "ばなな",
            "grape": "ぶどう",
            "peach": "もも",
            "pear": "なし"
        ]
        
        let inputText : String = textField.text!
        
        if let word = dictionary[inputText] {
            answer.text = word
        } else {
            answer.text = "登録されていません"
        }
    }
    
}

