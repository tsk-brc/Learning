require './app/mission_d_147.rb'

describe '体積チェック' do
  describe '出力結果のテスト' do
    let(:missionD147) { MissionD147.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "20\n", "12 13 14 15\n"
      expect($stdout).to receive(:puts).with(240)
      missionD147.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "10\n", "5 2 10 2\n"
      expect($stdout).to receive(:puts).with(20)
      missionD147.run
    end
  end
end
