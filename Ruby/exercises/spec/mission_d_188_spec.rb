require './app/mission_d_188.rb'

describe 'ブラックジャックスコアチェック' do
  describe '出力結果のテスト' do
    let(:missionD188) { MissionD188.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "8\n", "13\n"
      expect($stdout).to receive(:puts).with('Win')
      missionD188.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n", "13\n"
      expect($stdout).to receive(:puts).with(14)
      missionD188.run
    end
  end
end
