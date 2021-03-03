require './app/mission_d_144.rb'

describe '2進数変換チェック' do
  describe '出力結果のテスト' do
    let(:missionD144) { MissionD144.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "01011\n" }
      expect($stdout).to receive(:puts).with(11)
      missionD144.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "11111\n" }
      expect($stdout).to receive(:puts).with(31)
      missionD144.run
    end
  end
end
