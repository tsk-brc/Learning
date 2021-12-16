require './app/mission_c_100.rb'

describe '曲選択チェック' do
  describe '出力結果のテスト' do
    let(:missionC100) { MissionC100.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 6 30\n", "1 20\n", "2 30\n", "2 20\n",
        "3 30\n", "2 20\n"
      expect($stdout).to receive(:puts).with(3)
      missionC100.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 56 0\n", "2 4\n", "3 6\n", "3 59\n", "3 5\n"
      expect($stdout).to receive(:puts).with(4)
      missionC100.run
    end
  end
end
