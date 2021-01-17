require './app/mission_a_034.rb'

describe '残金チェック' do
  describe '出力結果のテスト' do
    let(:missionA034) { MissionA034.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3 300\n",
        "150\n",
        "200\n",
        "130\n"
      expect($stdout).to receive(:puts).with(20)
      missionA034.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 1000\n",
        "200\n",
        "20\n",
        "500\n",
        "60\n"
      expect($stdout).to receive(:puts).with(220)
      missionA034.run
    end
  end
end
