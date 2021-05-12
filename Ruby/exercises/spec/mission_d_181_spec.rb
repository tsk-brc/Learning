require './app/mission_d_181.rb'

describe '電話番号チェック' do
  describe '出力結果のテスト' do
    let(:missionD181) { MissionD181.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "10\n", "813\n", "100\n"
      expect($stdout).to receive(:puts).with('10-813-100')
      missionD181.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "11\n", "222\n", "3333\n"
      expect($stdout).to receive(:puts).with('11-222-3333')
      missionD181.run
    end
  end
end
