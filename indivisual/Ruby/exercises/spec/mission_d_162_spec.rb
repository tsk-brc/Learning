require './app/mission_d_162.rb'

describe '重量計算' do
  describe '出力結果のテスト' do
    let(:missionD162) { MissionD162.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "3\n" }
      expect(STDOUT).to receive(:puts).with(450)
      missionD162.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "1\n" }
      expect(STDOUT).to receive(:puts).with(150)
      missionD162.run
    end
  end
end
