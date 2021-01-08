require './app/mission_d_143.rb'

describe '制動距離算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD143) { MissionD143.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "100 40 2000\n" }
      expect($stdout).to receive(:puts).with(40)
      missionD143.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "200 15 100\n" }
      expect($stdout).to receive(:puts).with(225)
      missionD143.run
    end
  end
end
