require './app/mission_d_165.rb'

describe 'パスワードセキュリティチェック' do
  describe '出力結果のテスト' do

    let(:missionD165) { MissionD165.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "2020\n" }
      expect(STDOUT).to receive(:puts).with('NG')
      missionD165.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "1234\n" }
      expect(STDOUT).to receive(:puts).with('OK')
      missionD165.run
    end
  end
end