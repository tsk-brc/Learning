require './app/mission_d_196.rb'

describe '総計チェック' do
  describe '出力結果のテスト' do
    let(:missionD196) { MissionD196.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n", "120\n", "1000\n", "400\n"
      expect($stdout).to receive(:puts).with(1520)
      missionD196.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "5\n", "10\n", "100\n", "10000\n", "1\n", "1000\n"
      expect($stdout).to receive(:puts).with(11111)
      missionD196.run
    end
  end
end
