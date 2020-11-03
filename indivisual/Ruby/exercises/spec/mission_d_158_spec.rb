require './app/mission_d_158.rb'

describe '湿度チェック' do
  describe '出力結果のテスト' do
    let(:missionD158) { MissionD158.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "45\n" }
      expect(STDOUT).to receive(:puts).with('OK')
      missionD158.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "31\n" }
      expect(STDOUT).to receive(:puts).with('NG')
      missionD158.run
    end
  end
end
