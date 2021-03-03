require './app/mission_d_176.rb'

describe 'タイトルの長さチェック' do
  describe '出力結果のテスト' do
    let(:missionD176) { MissionD176.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "Programming\n" }
      expect($stdout).to receive(:puts).with('OK')
      missionD176.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "abcdefghijklmnopqrstu\n" }
      expect($stdout).to receive(:puts).with('NG')
      missionD176.run
    end
  end
end
