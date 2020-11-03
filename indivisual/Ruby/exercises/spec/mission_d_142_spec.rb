require './app/mission_d_142.rb'

describe '電球必要数算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD142) { MissionD142.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "6 3 10\n" }
      expect(STDOUT).to receive(:puts).with(20)
      missionD142.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "7 2 3\n" }
      expect(STDOUT).to receive(:puts).with(12)
      missionD142.run
    end
  end
end
