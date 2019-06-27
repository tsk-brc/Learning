from menu_item import MenuItem

menu_item1 = MenuItem('サンドイッチ', 500)
menu_item2 = MenuItem('チョコケーキ', 400)
menu_item3 = MenuItem('コーヒー', 300)
menu_item4 = MenuItem('オレンジジュース', 200)

# 指定されたリストを変数menu_itemsに代入してください
menu_items = [menu_item1, menu_item2, menu_item3, menu_item4]

# for文を作成してください
for menu_item in menu_items:
    print(menu_item.info())
