require './app/mission_d_145.rb'

describe 'プレイ回数チェック' do
  describe '出力結果のテスト' do

    let(:missionD145) { MissionD145.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "30 7\n" }
      expect(STDOUT).to receive(:puts).with(4)
      missionD145.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "99 3\n" }
      expect(STDOUT).to receive(:puts).with(33)
      missionD145.run
    end
  end
end