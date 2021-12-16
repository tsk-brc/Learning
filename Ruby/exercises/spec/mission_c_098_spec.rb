require './app/mission_c_098.rb'

describe 'ボール所持数チェック' do
  describe '出力結果のテスト' do
    let(:missionC098) { MissionC098.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n", "10\n", "5\n", "8\n", "3\n",
        "1 3 5\n", "3 2 3\n", "2 1 10\n"
      expect($stdout).to receive(:puts).with(13)
      expect($stdout).to receive(:puts).with(0)
      expect($stdout).to receive(:puts).with(10)
      missionC098.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "5\n", "51\n", "49\n", "15\n", "61\n", "40\n",
        "5\n", "3 1 5\n", "5 2 14\n", "4 3 79\n", "3 5 31\n", "4 3 51\n"
      expect($stdout).to receive(:puts).with(56)
      expect($stdout).to receive(:puts).with(63)
      expect($stdout).to receive(:puts).with(40)
      expect($stdout).to receive(:puts).with(0)
      expect($stdout).to receive(:puts).with(57)
      missionC098.run
    end
  end
end
