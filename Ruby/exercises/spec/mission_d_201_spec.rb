require './app/mission_d_201.rb'

describe '豆総数チェック' do
  describe '出力結果のテスト' do
    let(:missionD201) { MissionD201.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n", "11\n", "9\n", "8\n"
      expect { missionD201.run }.to output("28\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "10\n", "6\n", "7\n", "8\n", "9\n", "10\n",
        "11\n", "12\n", "13\n", "14\n", "15\n"
      expect { missionD201.run }.to output("105\n").to_stdout
    end
  end
end
