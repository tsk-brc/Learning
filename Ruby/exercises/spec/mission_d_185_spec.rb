require './app/mission_d_185.rb'

describe '時給計算チェック' do
  describe '出力結果のテスト' do
    let(:missionD185) { MissionD185.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "1120\n", "6\n"
      expect($stdout).to receive(:puts).with(6720)
      missionD185.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "2550\n", "120\n"
      expect($stdout).to receive(:puts).with(306000)
      missionD185.run
    end
  end
end
