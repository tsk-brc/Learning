require './app/mission_c_081.rb'

describe 'ペアチェック' do
  describe '出力結果のテスト' do

    let(:missionC081) { MissionC081.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "8\n", "A R\n", "A L\n", "B R\n", "A L\n", "A R\n", "B L\n", "A L\n", "C L\n"
      expect(STDOUT).to receive(:puts).with(3)
      missionC081.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "6\n", "R R\n", "T R\n", "R L\n", "T R\n", "T L\n", "T L\n"
      expect(STDOUT).to receive(:puts).with(3)
      missionC081.run
    end
  end
end