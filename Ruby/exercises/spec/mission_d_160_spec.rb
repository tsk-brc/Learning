require './app/mission_d_160.rb'

describe '高さ算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD160) { MissionD160.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "1250\n", "5\n"
      expect($stdout).to receive(:puts).with(625)
      missionD160.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3000\n", "10\n"
      expect($stdout).to receive(:puts).with(3000)
      missionD160.run
    end
  end
end
