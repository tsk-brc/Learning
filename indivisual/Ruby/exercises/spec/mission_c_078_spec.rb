require './app/mission_c_078.rb'

describe '株損益チェック' do
  describe '出力結果のテスト' do
    let(:missionC078) { MissionC078.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 110 120\n",
      "110\n",
      "100\n",
      "120\n",
      "130\n",
      "105\n"
      expect($stdout).to receive(:puts).with(30)
      missionC078.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3 100 200\n",
      "80\n",
      "80\n",
      "30\n"
      expect($stdout).to receive(:puts).with(-100)
      missionC078.run
    end
  end
end
