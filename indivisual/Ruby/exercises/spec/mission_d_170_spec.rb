require './app/mission_d_170.rb'

describe '走破距離チェック' do
  describe '出力結果のテスト' do
    let(:missionD170) { MissionD170.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "40\n", "15\n"
      expect(STDOUT).to receive(:puts).with(600)
      missionD170.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "125\n", "37\n"
      expect(STDOUT).to receive(:puts).with(4625)
      missionD170.run
    end
  end
end
