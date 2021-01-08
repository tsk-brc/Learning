require './app/mission_d_155.rb'

describe '入場料算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD155) { MissionD155.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "22\n", "15 50 100\n"
      expect($stdout).to receive(:puts).with(1100)
      missionD155.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "14\n", "20 200 350\n"
      expect($stdout).to receive(:puts).with(4900)
      missionD155.run
    end
  end
end
