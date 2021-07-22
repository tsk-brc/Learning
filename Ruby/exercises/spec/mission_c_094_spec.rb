require './app/mission_c_094.rb'

describe '税金徴収チェック' do
  describe '出力結果のテスト' do
    let(:missionC094) { MissionC094.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5\n",
      "450000\n",
      "200000\n",
      "100\n",
      "2000000\n",
      "1234567\n"
      expect($stdout).to receive(:puts).with(621913)
      missionC094.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3\n",
      "0\n",
      "9999\n",
      "9998\n"
      expect($stdout).to receive(:puts).with(0)
      missionC094.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "3\n",
      "100009\n",
      "750009\n",
      "1500009\n"
      expect($stdout).to receive(:puts).with(280004)
      missionC094.run
    end
  end
end
