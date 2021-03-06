class Password < ActiveRecord::Migration[5.0]
  def change
    add_column :Users, :password, :string
  end
end
