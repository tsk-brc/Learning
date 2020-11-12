require './app/mission_d_169.rb'

describe '寒暖差チェック' do
  describe '出力結果のテスト' do
    let(:missionD169) { MissionD169.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "25 18\n" }
      expect(STDOUT).to receive(:puts).with(7)
      missionD169.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "0 0\n" }
      expect(STDOUT).to receive(:puts).with(0)
      missionD169.run
    end
  end
end
