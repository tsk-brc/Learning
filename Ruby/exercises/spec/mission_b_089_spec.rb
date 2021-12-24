require './app/mission_b_089.rb'

describe '文字列探索チェック' do
  describe '出力結果のテスト' do
    let(:missionB089) { MissionB089.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "6 2\n",
      "HPPLLM\n",
      "UROQUV\n",
      "FBSRZY\n",
      "DPEFKT\n",
      "GBBEUY\n",
      "EMCQFY\n",
      "BEEF\n",
      "PORK\n"
      expect { missionB089.run }.to output("2 3\n2 1\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 2\n",
      "ACEG\n",
      "HBDF\n",
      "EGAC\n",
      "DFHB\n",
      "ABA\n",
      "BAB\n"
      expect { missionB089.run }.to output("1 1\n2 2\n").to_stdout
    end
  end
end
