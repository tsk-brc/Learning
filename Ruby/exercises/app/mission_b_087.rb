=begin

=end

class MissionB087
  def run
    def max_num_search(vertical, horizontial, num_digits, num_array, vertical_search_flg)
      max_num = 0
      vertical.times{ |num1|
        (horizontial - num_digits + 1).times{ |num2|
          target = ''
          num_digits.times{ |num3|
            if vertical_search_flg
              target << num_array[num1][num2 + num3]
            else
              target << num_array[num2 + num3][num1]
            end
          }
          max_num = target.to_i if target.to_i > max_num
        }
      }
      max_num
    end

    input_line = gets.split.map!(&:to_i)
    num_array = []
    input_line[0].times{ |num|
      num_array[num] = gets
    }

    if max_num_search(input_line[0], input_line[1], input_line[2], num_array, true) > max_num_search(input_line[1], input_line[0], input_line[2], num_array, false)
      puts max_num_search(input_line[0], input_line[1], input_line[2], num_array, true)
    else
      puts max_num_search(input_line[1], input_line[0], input_line[2], num_array, false) 
    end    
  end
end
