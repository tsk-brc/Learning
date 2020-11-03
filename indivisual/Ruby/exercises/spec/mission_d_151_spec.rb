require './app/mission_d_151.rb'

describe '値段算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD151) { MissionD151.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "chocolate\n", "100\n"
      expect(STDOUT).to receive(:puts).with(200)
      missionD151.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "cake\n", "500\n"
      expect(STDOUT).to receive(:puts).with(2500)
      missionD151.run
    end
  end
end
