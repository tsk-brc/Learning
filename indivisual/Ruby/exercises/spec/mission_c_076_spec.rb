require './app/mission_c_076.rb'

describe '給料チェック' do
  describe '出力結果のテスト' do
    let(:missionC076) { MissionC076.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "1000 1300 1500\n", "4\n", "0 9\n", "9 17\n", "17 22\n", "22 23\n"
      expect(STDOUT).to receive(:puts).with(29500)
      missionC076.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "1300 1500 1700\n", "7\n", "8 19\n", "9 20\n", "10 21\n", "11 22\n", "0 23\n", "20 22\n", "0 21\n"
      expect(STDOUT).to receive(:puts).with(130000)
      missionC076.run
    end
  end
end
