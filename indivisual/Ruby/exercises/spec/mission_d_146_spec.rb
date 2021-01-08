require './app/mission_d_146.rb'

describe '省略形チェック' do
  describe '出力結果のテスト' do
    let(:missionD146) { MissionD146.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "tamago\n" }
      expect($stdout).to receive(:puts).with('tmg')
      missionD146.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "muhammad\n" }
      expect($stdout).to receive(:puts).with('mhmmd')
      missionD146.run
    end
  end
end
