require './app/mission_d_153.rb'

describe '数値大小チェック' do
  describe '出力結果のテスト' do
    let(:missionD153) { MissionD153.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "100 200 300\n" }
      expect($stdout).to receive(:puts).with(200)
      missionD153.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "690 342 960\n" }
      expect($stdout).to receive(:puts).with(690)
      missionD153.run
    end
  end
end
