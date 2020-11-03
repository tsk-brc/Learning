require './app/mission_d_161.rb'

describe '面積算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD161) { MissionD161.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "100\n", "1\n", "2\n", "3\n", "4\n", "5\n", "6\n", "7\n"
      expect(STDOUT).to receive(:puts).with(28)
      missionD161.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "200\n", "10\n", "20\n", "30\n", "40\n", "50\n", "60\n", "70\n"
      expect(STDOUT).to receive(:puts).with(200)
      missionD161.run
    end
  end
end
