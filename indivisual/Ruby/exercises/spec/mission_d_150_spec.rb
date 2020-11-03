require './app/mission_d_150.rb'

describe '目標値差分チェック' do
  describe '出力結果のテスト' do
    let(:missionD150) { MissionD150.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "299998\n", "300000\n"
      expect(STDOUT).to receive(:puts).with(2)
      missionD150.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "300001\n", "300000\n"
      expect(STDOUT).to receive(:puts).with('Thank you')
      missionD150.run
    end
  end
end
