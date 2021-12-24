require './app/mission_b_076.rb'

describe 'パン購入チェック' do
  describe '出力結果のテスト' do
    let(:missionB076) { MissionB076.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "2 4\n",
      "150 2\n",
      "200 3\n",
      "buy 1 2\n",
      "buy 1 2\n",
      "bake 0 1\n",
      "buy 0 2\n"
      expect { missionB076.run }.to output("550\n-1\n400\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3 6\n",
      "300 3\n",
      "140 5\n",
      "200 5\n",
      "buy 1 1 1\n",
      "buy 3 4 0\n",
      "bake 1 1 1\n",
      "buy 3 4 0\n",
      "buy 0 0 2\n",
      "buy 1 0 0\n"
      expect { missionB076.run }.to output("640\n-1\n1460\n400\n-1\n").to_stdout
    end
  end
end
