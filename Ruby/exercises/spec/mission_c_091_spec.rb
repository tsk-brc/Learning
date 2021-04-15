require './app/mission_c_091.rb'

describe '出荷チェック' do
  describe '出力結果のテスト' do
    let(:missionC091) { MissionC091.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "10 3\n",
      "24\n",
      "35\n",
      "3\n"
      expect($stdout).to receive(:puts).with(20)
      expect($stdout).to receive(:puts).with(40)
      expect($stdout).to receive(:puts).with(10)
      missionC091.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "50 3\n",
      "40\n",
      "90\n",
      "10\n"
      expect($stdout).to receive(:puts).with(50)
      expect($stdout).to receive(:puts).with(100)
      expect($stdout).to receive(:puts).with(50)
      missionC091.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "3 2\n",
      "9\n",
      "5\n"
      expect($stdout).to receive(:puts).with(9)
      expect($stdout).to receive(:puts).with(6)
      missionC091.run
    end
  end
end
