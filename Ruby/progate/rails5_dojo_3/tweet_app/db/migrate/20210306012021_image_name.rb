class ImageName < ActiveRecord::Migration[5.0]
  def change
    add_column:Users, :image_name, :string
  end
end
