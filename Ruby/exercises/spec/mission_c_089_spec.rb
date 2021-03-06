require './app/mission_c_089.rb'

describe 'ストラックアウトのスコアチェック' do
  describe '出力結果のテスト' do
    let(:missionC089) { MissionC089.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "4 3\n",
      "oxo\n",
      "oox\n",
      "oxo\n",
      "xxx\n",
      "1 2 3\n",
      "4 5 6\n",
      "7 8 9\n",
      "10 11 12\n"
      expect($stdout).to receive(:puts).with(29)
      missionC089.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "xxx\n",
      "xxx\n",
      "100 100 100\n",
      "100 100 100\n"
      expect($stdout).to receive(:puts).with(0)
      missionC089.run
    end
  end
end
