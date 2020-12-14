require './app/mission_d_171.rb'

describe '目標値差分チェック' do
  describe '出力結果のテスト' do
    let(:missionD171) { MissionD171.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "30 50\n", "40\n"
      expect(STDOUT).to receive(:puts).with('-10 10')
      missionD171.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "100 20\n", "39\n"
      expect(STDOUT).to receive(:puts).with('61 -19')
      missionD171.run
    end
  end
end
