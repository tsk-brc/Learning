require './app/mission_c_080.rb'

describe 'ボタン押しゲームのチェック' do
  describe '出力結果のテスト' do
    let(:missionC080) { MissionC080.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "4 2\n", "6\n", "1 1 3 4 1 2\n"
      expect($stdout).to receive(:puts).with(5000)
      missionC080.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "2 1\n", "4\n", "1 1 1 1\n"
      expect($stdout).to receive(:puts).with(-1)
      missionC080.run
    end
  end
end
