require './app/mission_c_092.rb'

describe '商品チェック' do
  describe '出力結果のテスト' do
    let(:missionC092) { MissionC092.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 3 2\n",
      "RRLFL\n",
      "RFR\n",
      "LR\n"
      expect($stdout).to receive(:puts).with('1 1')
      missionC092.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3 3 3\n",
      "LLL\n",
      "LLL\n",
      "FFF\n"
      expect($stdout).to receive(:puts).with('0 3')
      missionC092.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "4 3 3\n",
      "RLRF\n",
      "RRL\n",
      "RLF\n"
      expect($stdout).to receive(:puts).with('1 0')
      missionC092.run
    end

    it 'テスト4' do
      allow($stdin).to receive(:gets).and_return "5 3 2\n",
      "RRLLF\n",
      "RRL\n",
      "RL\n"
      expect($stdout).to receive(:puts).with('0 0')
      missionC092.run
    end
  end
end
