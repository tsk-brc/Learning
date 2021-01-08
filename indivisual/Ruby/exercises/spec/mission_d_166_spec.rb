require './app/mission_d_166.rb'

describe '日数変換チェック' do
  describe '出力結果のテスト' do
    let(:missionD166) { MissionD166.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "6\n" }
      expect($stdout).to receive(:puts).with(42)
      missionD166.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "1\n" }
      expect($stdout).to receive(:puts).with(7)
      missionD166.run
    end
  end
end
