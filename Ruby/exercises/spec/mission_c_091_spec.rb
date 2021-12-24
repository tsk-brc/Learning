require './app/mission_c_091.rb'

describe '出荷チェック' do
  describe '出力結果のテスト' do
    let(:missionC091) { MissionC091.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "10 3\n",
      "24\n",
      "35\n",
      "3\n"
      expect { missionC091.run }.to output("20\n40\n10\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "50 3\n",
      "40\n",
      "90\n",
      "10\n"
      expect { missionC091.run }.to output("50\n100\n50\n").to_stdout
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "3 2\n",
      "9\n",
      "5\n"
      expect { missionC091.run }.to output("9\n6\n").to_stdout
    end
  end
end
