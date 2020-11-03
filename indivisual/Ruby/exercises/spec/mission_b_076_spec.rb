require './app/mission_b_076.rb'

describe 'パン購入チェック' do
  describe '出力結果のテスト' do
    let(:missionB076) { MissionB076.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "2 4\n", "150 2\n", "200 3\n", "buy 1 2\n", "buy 1 2\n", "bake 0 1\n", "buy 0 2\n"
      expect(STDOUT).to receive(:puts).with(550)
      expect(STDOUT).to receive(:puts).with(-1)
      expect(STDOUT).to receive(:puts).with(400)
      missionB076.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "3 6\n", "300 3\n", "140 5\n", "200 5\n", "buy 1 1 1\n", "buy 3 4 0\n", "bake 1 1 1\n", "buy 3 4 0\n", "buy 0 0 2\n", "buy 1 0 0\n"
      expect(STDOUT).to receive(:puts).with(640)
      expect(STDOUT).to receive(:puts).with(-1)
      expect(STDOUT).to receive(:puts).with(1460)
      expect(STDOUT).to receive(:puts).with(400)
      expect(STDOUT).to receive(:puts).with(-1)
      missionB076.run
    end
  end
end
