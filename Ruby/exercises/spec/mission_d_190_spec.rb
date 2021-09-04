require './app/mission_d_190.rb'

describe 'mm→cm変換チェック' do
  describe '出力結果のテスト' do
    let(:missionD190) { MissionD190.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "45\n" }
      expect($stdout).to receive(:puts).with(450)
      missionD190.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "1\n" }
      expect($stdout).to receive(:puts).with(10)
      missionD190.run
    end
  end
end
