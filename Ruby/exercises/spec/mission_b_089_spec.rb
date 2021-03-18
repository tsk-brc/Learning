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
      expect($stdout).to receive(:puts).with('2 3')
      expect($stdout).to receive(:puts).with('2 1')
      missionB089.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 2\n",
      "ACEG\n",
      "HBDF\n",
      "EGAC\n",
      "DFHB\n",
      "ABA\n",
      "BAB\n"
      expect($stdout).to receive(:puts).with('1 1')
      expect($stdout).to receive(:puts).with('2 2')
      missionB089.run
    end
  end
end
