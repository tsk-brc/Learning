require './app/mission_d_175.rb'

describe '12進数変換チェック' do
  describe '出力結果のテスト' do
    let(:missionD175) { MissionD175.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "B\n" }
      expect($stdout).to receive(:puts).with(11)
      missionD175.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "A\n" }
      expect($stdout).to receive(:puts).with(10)
      missionD175.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets) { "9\n" }
      expect($stdout).to receive(:puts).with(9)
      missionD175.run
    end
  end
end
