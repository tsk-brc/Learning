require './app/mission_d_156.rb'

describe '面積算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD156) { MissionD156.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "4\n", "15\n"
      expect(STDOUT).to receive(:puts).with(60)
      missionD156.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "3\n", "12\n"
      expect(STDOUT).to receive(:puts).with(36)
      missionD156.run
    end
  end
end
