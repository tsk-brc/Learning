require './app/mission_c_096.rb'

describe '休暇チェック' do
  describe '出力結果のテスト' do
    let(:missionC096) { MissionC096.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "2\n", "16 19\n", "14 17\n"
      expect($stdout).to receive(:puts).with('OK')
      missionC096.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3\n", "22 23\n", "17 20\n", "14 19\n"
      expect($stdout).to receive(:puts).with('NG')
      missionC096.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "10\n", "1 10\n", "2 9\n", "4 7\n", "3 13\n",
        "5 6\n", "1 6\n", "2 8\n", "4 5\n", "4 7\n", "3 15\n"
      expect($stdout).to receive(:puts).with('OK')
      missionC096.run
    end
  end
end
