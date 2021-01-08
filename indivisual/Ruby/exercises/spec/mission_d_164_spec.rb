require './app/mission_d_164.rb'

describe 'べき乗チェック' do
  describe '出力結果のテスト' do
    let(:missionD164) { MissionD164.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "256\n" }
      expect($stdout).to receive(:puts).with('OK')
      missionD164.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "255\n" }
      expect($stdout).to receive(:puts).with('NG')
      missionD164.run
    end
  end
end
