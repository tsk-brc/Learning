require './app/mission_d_203.rb'

describe '文字列存在チェック' do
  describe '出力結果のテスト' do
    let(:missionD203) { MissionD203.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "pizza\n", "i\n", "2\n"
      expect { missionD203.run }.to output("Yes\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "program\n", "g\n", "2\n"
      expect { missionD203.run }.to output("No\n").to_stdout
    end
  end
end
