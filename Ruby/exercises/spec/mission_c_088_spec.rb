require './app/mission_c_088.rb'

describe '残金チェック' do
  describe '出力結果のテスト' do
    let(:missionC088) { MissionC088.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n",
      "10 100 50\n",
      "300 5\n",
      "1 5\n",
      "2 3\n",
      "3 1\n",
      "2 1\n",
      "1 3\n"
      expect($stdout).to receive(:puts).with(70)
      missionC088.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "5\n",
      "5 3 4 1 6\n",
      "100 5\n",
      "2 9\n",
      "3 6\n",
      "2 6\n",
      "5 6\n",
      "5 4\n"
      expect($stdout).to receive(:puts).with(7)
      missionC088.run
    end
  end
end
